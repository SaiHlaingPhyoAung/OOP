package L8_Nested_Class;

public class L3_Local_Class {

    /*
    local class twy ko yay chin yin Code Block hte mr yay
    tone chin yin yay p mha tone loh ya
    Class mr Access Modifier yay loh ma ya
    Class mr final yay loh ya
    Tuh hte ka Method / Variable twy ka Access Modifier yay loh ya

    Class များအား Method Body အတွင်းတွင်ေရးသားနိုင်ပြီး ၎င်း
    တို့အား Local Class ဟုခေါ်ဆိုကြသည်။
•   Java 8 မတိုင်မှီအထိ Local Class အတွင်းမှ final Member များ
    ကိုသာ အသံုးပြုနိုင်ကြပါသည်။
•   ၎င်းတို့အား Method အတွင်းမှာပင် Instance ေဆာက်၍ Method
    အတွင်းမှာပင်အသံုးပြုနိုင်ပါသည်။
     */

    public static void main(String []arg){
        L3_Local_Class t = new L3_Local_Class();
        t.method("Hola Java");
    }

    public void method(final String name){
        class LocalClass{
            void show(){
                System.out.println("Hello From local Class " + name);
            }
        }
        LocalClass lc = new LocalClass();
        lc.show();
    }


}
