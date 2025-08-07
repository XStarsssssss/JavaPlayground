public class Lyrics {
    static String[] lyrics = {
            "မင်းငါ့ရဲ့ ကောင်းကင် အိပ်မက်ထဲကနတ်သမီး",
            "နေ့နဲ့ညနဲ့ ပြောင်းတောင်အချိန်တိုင်းရှိ",
            "အချစ်လေး",
            "ချစ်တတ်တဲ့စိတ်တွေ ဖန်ဆင်းပေးတဲ့နတ်သမီး",
            "မင်းနဲ့မှ အချစ်ကို ခံစားမိ အချစ်လေး",
            "လူငယ်တွေ အရွယ်မှာ အမြဲတမ်းဖြစ်တတ်တဲ့ရန်",
            "စိတ်ရိုင်းလေးနဲ့ငါဟာ",
            "နားမရှိတဲ့ ဇာတ်ကောင်",
            "မိဘကပြောတော့ လေထဲကအမှိုက်လို",
            "မိုက်ကြည့်ကြည့်နဲ့ငါ ၀ါးတားတားပဲနားထောင်",
            "ဒီအချိန်မှာ ငါ အားလုံးကြည့်တဲ့ရှေ့မှာ",
            "ရိုးသားတဲ့ ပုံစံ စဉ်းစားလို့ကြည့်ပါ",
            "ဒီလိုပုံလိမ်မာ ရိုးသားလို့သွားတာ",
            "မင်းလေးပေးတဲ့အချစ်တွေ",
            "မင်းလေးပြောတဲ့စကားတွေ",
            "မင်းငါ့ရဲ့ ကောင်းကင် အိပ်မက်ထဲကနတ်သမီး",
            "နေ့နဲ့ညနဲ့ ပြောင်းတောင်အချိန်တိုင်းရှိ",
            "အချစ်လေး",
            "Coding by X-Star",
            "Thank You"
    };
    static int[] Delays = {
            2400, 1500, 1700, 3300, 2650, 1300, 1100, 800, 900,
            800, 900, 700, 600, 400, 400, 900, 2400, 1500, 1700,1000,1000
    };
    public static void PrintLyrics(){
        for(int i =0; i < lyrics.length;i++){
            String line = lyrics[i];
            for(char c : line.toCharArray()){
                System.out.print(c);
                System.out.flush();
                try{
                    Thread.sleep(60);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
            try{
                Thread.sleep(Delays[i]);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
    }

}
