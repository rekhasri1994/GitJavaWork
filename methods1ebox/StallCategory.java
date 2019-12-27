
public class StallCategory {
    //Write your code here
    private String name;
        private String detail;
        
        public StallCategory()
        {
            System.out.println("Using Default Constructor");
            System.out.println("Details of the stall category:");
            
        }
        public StallCategory(String name,String detail)
        {
            System.out.println("Using Parameterised Constructor");
            System.out.println("Details of the stall category:");
            System.out.println("Name:"+name+"\nDetail:"+detail);
            
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(String name){
            return this.name;
        }
        public void setDetail(String detail){
            this.detail = detail;
        }
        public String getDetail(String detail){
            return this.detail;
        }
    }