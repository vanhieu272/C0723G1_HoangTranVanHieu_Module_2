package CaseStudy.Furama.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String EMPLOYEE_ID_REGEX = "^NV-\\d{4}$";
    private static final String NAME_REGEX = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$";
    private static final String BIRTHDAY_REGEX = "^(0[1-9]|[12]\\d|3[01])[-|/](0[1-9]|1[012])[-|/](19|20)\\d{2}$";
    private static final String CITIZEN_ID_REGEX = "^(\\d{9}|\\d{12})$";
    private static final String PHONE_REGEX = "^0\\d{9}$";
    private static final String EMAIL_REGEX = "^\\w+\\w*@\\w+(\\.\\w+)$";
//    private static final String GENDER_REGEX = "Female|Male|female|male";
//    private static final String EDUCATION_LEVEL_REGEX = "Intermediate Degree|College Degree|Bachelor's Degree|Postgraduate Degree";
//    private static final String POSITION_REGEX = "Receptionist|Waiter|Specialist|Supervisor|Manager|Director";
    private static final String CUSTOMER_ID_REGEX = "^KH-\\d{4}$";
//    private static final String CUSTOMER_CLASS_REGEX = "Diamond|Platinum|Gold|Silver|Member";
    private static final String VILLA_ID_REGEX = "^SVVL-\\d{4}$";
    private static final String HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
    private static final String ROOM_ID_REGEX = "^SVRO-\\d{4}$";
    private static final String SERVICE_NAME = "Villa|House|Room";

    private static Pattern pattern;

    private static Matcher matcher;

    public static boolean validate(String string, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static boolean validateEmployeeId(String id) {
        if (!validate(id, EMPLOYEE_ID_REGEX)) {
            System.out.println("Invalid ID! Please enter the correct format of ID.");
        }
        return validate(id, EMPLOYEE_ID_REGEX);
    }

    public static boolean validateCustomerId(String id) {
        if (!validate(id, CUSTOMER_ID_REGEX)) {
            System.out.println("Invalid ID! Please enter the correct format of ID.");
        }
        return validate(id, CUSTOMER_ID_REGEX);
    }

    public static boolean validateName(String name) {
        if (!validate(name, NAME_REGEX)) {
            System.out.println("Invalid name! Please enter again." +
                    "\n(Example: Hoang Hieu)");
        }
        return validate(name, NAME_REGEX);
    }

    private static boolean is18YearsOld(String dayOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dayOfBirth, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears() >= 18;
    }

    private static boolean checkLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    private static boolean isValidDate(String dayOfBirth) {
        int day = Integer.parseInt(dayOfBirth.substring(0, 2));
        int month = Integer.parseInt(dayOfBirth.substring(3, 5));
        int year = Integer.parseInt(dayOfBirth.substring(6));
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1800) {
            return false;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 31)) {
            return false;
        }
        if (month == 2) {
            if (!checkLeapYear(year)) {
                if (day > 28) {
                    return false;
                }
            } else {
                if (day > 29) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean validateDayOfBirth(String dayOfBirth) {
            if (!validate(dayOfBirth, BIRTHDAY_REGEX) || !isValidDate(dayOfBirth)) {
                System.out.println("Invalid format day of birth! Please enter again (dd/mm/yyyy).");
                return false;
            }
             else if(!is18YearsOld(dayOfBirth)){
                System.out.println("Age must be at least 18!");
                return false;
            }
        return true;
    }

//    public static boolean validateGender(String gender) {
//        if (!validate(gender, GENDER_REGEX)) {
//            System.out.println("Invalid gender! Please enter again.");
//        }
//        return validate(gender, GENDER_REGEX);
//    }

    public static boolean validateCitizenID(String citizenID) {
        if (!validate(citizenID, CITIZEN_ID_REGEX)) {
            System.out.println("Invalid citizenID! Please enter again.");
        }
        return validate(citizenID, CITIZEN_ID_REGEX);
    }

    public static boolean validatePhoneNumber(String phone) {
        if (!validate(phone, PHONE_REGEX)) {
            System.out.println("Invalid phoneNumber! Please enter again.");
        }
        return validate(phone, PHONE_REGEX);
    }

    public static boolean validateEmail(String email) {
        if (!validate(email, EMAIL_REGEX)) {
            System.out.println("Invalid email! Please enter again.");
        }
        return validate(email, EMAIL_REGEX);
    }

//    public static boolean validateEducationLevel(String educationLevel) {
//        if (!validate(educationLevel, EDUCATION_LEVEL_REGEX)) {
//            System.out.println("Invalid educationLevel! Please enter again.");
//        }
//        return validate(educationLevel, EDUCATION_LEVEL_REGEX);
//    }

//    public static boolean validatePosition(String position) {
//        if (!validate(position, POSITION_REGEX)) {
//            System.out.println("Invalid position! Please enter again.");
//        }
//        return validate(position, POSITION_REGEX);
//    }

//    public static boolean validateCustomerCLass(String type) {
//        if (!validate(type, CUSTOMER_CLASS_REGEX)) {
//            System.out.println("Invalid type! Please enter again.");
//        }
//        return validate(type, CUSTOMER_CLASS_REGEX);
//    }

    public static boolean validateVilla(String villa) {
        if (!validate(villa, VILLA_ID_REGEX)) {
            System.out.println("Invalid Villa Id! Please enter again.");
        }
        return validate(villa, VILLA_ID_REGEX);
    }

    public static boolean validateHouse(String house) {
        if (!validate(house, HOUSE_ID_REGEX)) {
            System.out.println("Invalid House Id! Please enter again.");
        }
        return validate(house, HOUSE_ID_REGEX);
    }

    public static boolean validateRoom(String room) {
        if (!validate(room, ROOM_ID_REGEX)) {
            System.out.println("Invalid Room Id! Please enter again.");
        }
        return validate(room, ROOM_ID_REGEX);
    }

    public static boolean validateServiceName(String service) {
        if (!validate(service, SERVICE_NAME)) {
            System.out.println("Invalid service name! Please enter again.");
        }
        return validate(service, SERVICE_NAME);
    }
}
