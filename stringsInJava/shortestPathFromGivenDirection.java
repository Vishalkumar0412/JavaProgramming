package stringsInJava;
    // given a route in four directions (E,V,N,S) find the shortest path to reached destination WNEENESENNN

public class shortestPathFromGivenDirection {
  public static void main(String[] args) {
    String str ="WNEENESENNN";
    int x=0;
    int y=0; 
    for(int i=0;i<str.length();i++){
      switch (str.charAt(i)) {
        case 'W': x--;
           break;
        case 'E': x++;
           break;
        case 'N': y++;
           break;
        case 'S':  y--;
           break;
      
        default: System.out.println("invalid route");
          break;
      }

    }
      System.out.println("Location of destination is "+x+","+y);
      System.out.println("Location of origin 0 ,0");
      float displacement = (float) Math.sqrt(Math.pow(x-0, 2)+Math.pow(y-0, 2));
      System.out.println(displacement);
  }
}
