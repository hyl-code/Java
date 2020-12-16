 class Number1 {
     private int n1;
     private int n2;

     Number1(int n1, int n2) {
         this.n1 = n1;
         this.n2 = n2;
     }

     public void addtion() {
         p(n1 + n2);
     }

     public void subtration() {
         p(n1 - n2);
     }

     public void multiplication() {
         p(n1 * n2);
     }

     public void division() {
         p(n1 / n2);
     }

     public void p(int n) {
         System.out.println(n);
     }
 }
    class Number2
    {
        public static void main(String[] args)
        {
            Number1 n=new Number1(6,2);
            n.addtion();
            n.subtration();
            n.multiplication();
            n.division();
        }
    }