/**
 * LostException
 * 异常丢失的两种情况：
 * 1：在finally块抛出新的异常，旧的异常信息会丢失
 * 2：在finally块使用return语句,try块只的异常就会丢失
 */
public class LostException {

    public void f() throws VeryImportException {
        throw new VeryImportException();
    }

    public void g() throws TrivialException {
        throw new TrivialException();
    }

    public static void main(String[] args){
        /* try{
            LostException le=new LostException();
            try{
                le.f();
            }finally{
                le.g();
            }
        }catch(Exception e){
            e.printStackTrace();
        } */
        
        try{
            LostException le=new LostException();
            le.f();
        }finally{
            return ;
        }
    }
}

class VeryImportException extends Exception {
}

class TrivialException extends Exception {
}