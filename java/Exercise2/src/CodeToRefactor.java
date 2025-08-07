import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Refactored version of the original CodeToRefactor.
 */
public class RefactoredPeopleManager {

    /**
     * Represents a person with name and date of birth.
     */
    public static class Person {
        private static final OffsetDateTime DEFAULT_UNDER_16_DOB = OffsetDateTime.now().minusYears(15);

        private final String name;
        private final OffsetDateTime dob;

        public Person(String name) {
            this(name, DEFAULT_UNDER_16_DOB.toLocalDateTime());
        }

        public Person(String name, LocalDateTime dob) {
            this.name = name;
            this.dob = dob.atOffset(ZoneOffset.systemDefault().getRules().getOffset(LocalDateTime.now()));
        }

        public String getName() {
            return name;
        }

        public OffsetDateTime getDob() {
            return dob;
        }

        public int getAgeInYears() {
            return OffsetDateTime.now().getYear() - dob.getYear();
        }
    }

    /**
     * Factory class responsible for managing a list of people.
     */
    public static class BirthingUnit {
        private static final int MAX_NAME_LENGTH = 255;
        private static final int MIN_AGE = 18;
        private static final int MAX_AGE = 85;

        private final List<Person> people = new ArrayList<>();
        private final Random random = new Random();

        /**
         * Generates and adds `count` random people (either Bob or Betty).
         * 
         * @param count Number of people to generate
         * @return List of all generated people
         */
        public List<Person> generatePeople(int count) {
            for (int i = 0; i < count; i++) {
                String name = random.nextBoolean() ? "Bob" : "Betty";
                int age = MIN_AGE + random.nextInt(MAX_AGE - MIN_AGE + 1);
                LocalDateTime dob = LocalDateTime.now().minusYears(age);

                people.add(new Person(name, dob));
            }
            return new ArrayList<>(people);
        }

        /**
         * Returns a filtered list of people named "Bob".
         * 
         * @param onlyOlderThan30 If true, filter only Bobs older than 30
         * @return List of Bobs meeting the condition
         */
        public List<Person> getBobs(boolean onlyOlderThan30) {
            OffsetDateTime thirtyYearsAgo = OffsetDateTime.now().minusYears(30);
            return people.stream()
                    .filter(p -> "Bob".equals(p.getName()))
                    .filter(p -> !onlyOlderThan30 || p.getDob().isBefore(thirtyYearsAgo))
                    .collect(Collectors.toList());
        }

        /**
         * Simulates marriage by combining first and last names.
         * Skips test data and truncates if the name is too long.
         * 
         * @param person Person to "marry"
         * @param lastName Last name to append
         * 
         * @return Full name
         */
        public String getMarriedName(Person person, String lastName) {
            if (lastName == null || lastName.contains("test")) {
                return person.getName();
            }

            String fullName = person.getName() + " " + lastName;
            return fullName.length() > MAX_NAME_LENGTH ? fullName.substring(0, MAX_NAME_LENGTH) : fullName;
        }
    }
}
