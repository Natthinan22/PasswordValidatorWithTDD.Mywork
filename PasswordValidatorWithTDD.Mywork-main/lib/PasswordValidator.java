package lib;

public class PasswordValidator {

    /**
     * การทดสอบความปลอดภัยของรหัสผ่าน ว่ายากหรือง่าย
     * @param การรับรหัสเข้ามาเพื่อประเมินความยากง่ายของรหัสไม่รับnullกับempty
     * @return บอกผลลัพธ์ของรหัสผ่านที่ใส่เข้ามาว่าระดับไหน  password => invalid, weak, medium, strong
     */
   
    public static PasswordStrength validate (String password) {
        boolean hasSpecial = false;
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;


        if (password == null || password.length()<8) 
            return PasswordStrength.INVALID ;

        int count = 0; 
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                hasLower = true;
        } else if(Character.isUpperCase(c)){
                hasUpper = true;
        } else if(Character.isDigit(c)){
                hasDigit = true;
        } else hasSpecial = true;        
    }
        if(hasLower){count++;}
        if(hasUpper){count++;}
        if(hasDigit){count++;}
        if(hasSpecial){count++;}

        if(count==4){
            return PasswordStrength.STRONG;
        } else if(count == 3){
            return PasswordStrength.MEDIUM;
        } else 
            return PasswordStrength.WEAK;
    
       
}

}



// boolean hasLower    = password.matches(".*[a-z].*");
// boolean hasUpper    = password.matches(".*[A-Z].*");
// boolean hasDigit    = password.matches(".*0-9.*");
// boolean hasSpecial  = password.matches(".*[@#$%^&+=!()\\[\\]{}<>?/\\\\|~`.,:;\"'-].*");

 // 4. ตรวจสอบเงื่อนไขขั้นต่ำ (weak ถ้าไม่ครบ)

//  if(hasDigit&&hasLower){
//     System.err.println("กำลังดีครับพี่ มิจจี้เดาได้");
//     return PasswordStrength.WEAK;
//  }else
//  if(hasUpper&&hasLower&&hasUpper) {
//     System.err.println("อีกนิดนึง อันนี้ดีละ");
//     return PasswordStrength.MEDIUM;
//  }else
//  if(hasDigit&&hasLower&&hasSpecial&&hasUpper){
//     System.err.println("very Good");
//     return PasswordStrength.STRONG;
//  }else
// return PasswordStrength.WEAK ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?