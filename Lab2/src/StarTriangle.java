public class StarTriangle {
    int width;
    String result;
    StarTriangle(int width){
        this.width = width;
        result = "";
    }

    void generateTriangle(){
        String pt = "[*]";
        for(int i=1; i<=width; i++){
            for(int j=1; j<=i; j++){
                result += pt;
            }
            result += '\n';
        }
    }
    public String toString(){
        generateTriangle();
        return result;
    }





    public static void main(String [] args){
        StarTriangle tr = new StarTriangle(4);
        System.out.println(tr.toString());
    }
}
