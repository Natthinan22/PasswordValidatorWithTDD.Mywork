package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
         //Test Case 1: รหัสผ่านสั้นควรจะ INVALID
         String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 :"+pw+" Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        //Test Case 2: ตัวพิมพ์เล็ก WEAK
        pw = "sdffgblksf";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK){
            System.out.println("Test Case 2 Passed: Your password is WEAK");
        }else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }
        //Test Case 3: รหัสผ่านพิมพ์ใหญ่มีตัวเลข MEDIUM
        pw = "NatthinanJula2216";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: Your password is MEDIUM");
        }else {
            System.out.println("Test Case 3 FAILED: Expected INVALID but got " + result3);
        }
        //Test Case 4: รหัสผ่านพิมพ์ใหญ่มีตัวเลข STRONG
        pw = "NatthinanJula2216#_";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: Your password is STRONG");
        }else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}
