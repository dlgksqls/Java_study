package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
        } catch (Exception e){
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally { // try가 잘 수행이 됐으면 바로 finally, 에러 발생했으면 catch 실행하고 finally
            System.out.println("택시의 문을 닫는다.");
        }

        // try + catch
        // try + catch(s) + finally
        // try + finally
    }
}
