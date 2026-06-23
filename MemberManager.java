package jumptojava;

class Member {
    String name;
    int point;

    Member(String n, int p) {
        name = n;
        point = p;
    }

    
    void showInfo() {
        System.out.println(name + " 회원 정보");
    }

  
    void showInfo(int addpoint) {
        System.out.println("총 포인트: " + (point + addpoint));
    }
}


class VIPMember extends Member {
    double discountRate;

    VIPMember(String n, int p, double d) {
        super(n, p);
        this.discountRate = d;
    }

   
    void showInfo() {
        System.out.println(name + " VIP 회원 정보");
    }

    void useCoupon(int price) {
        System.out.println((int) (price * discountRate) + "원 할인");
    }
}

public class MemberManager {
    public static void main(String[] args) {
       
        VIPMember member = new VIPMember("smart", 2500, 0.15);
        
        member.showInfo();       
        member.showInfo(500);    
        member.useCoupon(30000); 
    }
}