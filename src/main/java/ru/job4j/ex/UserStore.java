package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                throw new UserNotFoundException("User is not founded");
            }

        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user == null || user.isValid() || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("User is not Valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}