package utilities;

import day_40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main (String[] args){


        //System.out.println(AccessModifiers_Test4.name1);  default is not visible here
        System.out.println(AccessModifiers_Test4.name2);    //protected is visible cause it is a subclass of ProtectedAccess...
    }


}
