import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;
import java.util.List;

public class RefactoredPeopleManagerTest {

    private RefactoredPeopleManager.BirthingUnit birthingUnit;

    @BeforeEach
    public void setUp() {
        birthingUnit = new RefactoredPeopleManager.BirthingUnit();
    }

    @Test
    public void testGeneratePeople_returnsCorrectCount() {
        List<RefactoredPeopleManager.Person> people = birthingUnit.generatePeople(10);
        assertEquals(10, people.size(), "Should generate 10 people");
    }

    @Test
    public void testGeneratePeople_containsOnlyBobOrBetty() {
        List<RefactoredPeopleManager.Person> people = birthingUnit.generatePeople(50);
        for (RefactoredPeopleManager.Person p : people) {
            assertTrue(p.getName().equals("Bob") || p.getName().equals("Betty"),
                "Name should be either Bob or Betty");
        }
    }

    @Test
    public void testGetBobs_returnsOnlyBobs() {
        birthingUnit.generatePeople(100);
        List<RefactoredPeopleManager.Person> bobs = birthingUnit.getBobs(false);
        assertTrue(bobs.stream().allMatch(p -> p.getName().equals("Bob")),
            "getBobs should return only Bobs");
    }

    @Test
    public void testGetBobsOlderThan30_onlyReturnsOlderBobs() {
        birthingUnit.generatePeople(100);
        List<RefactoredPeopleManager.Person> bobs = birthingUnit.getBobs(true);

        for (RefactoredPeopleManager.Person bob : bobs) {
            assertEquals("Bob", bob.getName());
            int age = OffsetDateTime.now().getYear() - bob.getDob().getYear();
            assertTrue(age > 30, "Bob should be older than 30");
        }
    }

    @Test
    public void testGetMarried_skipsTestLastName() {
        RefactoredPeopleManager.Person p = new RefactoredPeopleManager.Person("Alice");
        String marriedName = birthingUnit.getMarriedName(p, "testLastName");
        assertEquals("Alice", marriedName, "Should skip 'test' last names");
    }

    @Test
    public void testGetMarried_combinesNamesCorrectly() {
        RefactoredPeopleManager.Person p = new RefactoredPeopleManager.Person("Alice");
        String marriedName = birthingUnit.getMarriedName(p, "Smith");
        assertEquals("Alice Smith", marriedName, "Should return full married name");
    }

    @Test
    public void testGetMarried_truncatesLongNames() {
        String longLastName = "A".repeat(300);
        RefactoredPeopleManager.Person p = new RefactoredPeopleManager.Person("LongNamePerson");
        String marriedName = birthingUnit.getMarriedName(p, longLastName);
        assertTrue(marriedName.length() <= 255, "Married name should be at most 255 characters");
    }
}
