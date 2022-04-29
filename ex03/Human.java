package tut10.ex03;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols! Argument: firstName");
        }
        String firstLetter = firstName.substring(0, 1);
        String remainingLetters = firstName.substring(1,firstName.length());
        if(firstLetter != firstLetter.toUpperCase()) {
            throw new IllegalArgumentException("Expected upper case letter! Argument: firstName");
        }
        this.firstName = firstLetter + remainingLetters;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols! Argument: lastName");
        }
        String firstLetter = lastName.substring(0, 1);
        String remainingLetters = lastName.substring(1,lastName.length());
        if(firstLetter != firstLetter.toUpperCase()) {
            throw new IllegalArgumentException("Expected upper case letter! Argument: lastName");
        }
        this.lastName = firstLetter + remainingLetters;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
