public class shortestPath {
    public static float getshortestPath(String path){
        int x = 0 ,y = 0;
        for(int  i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'E'){
                x++;                    
            }else if(dir == 'W'){
                x--;
            }   

        }
        int x2 = x*x;
        int y2 = y*y;
        return (float) Math.sqrt(x2 + y2);


    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float distance = getshortestPath(path);
        System.out.println("Shortest Path Distance: " + distance);
        
    }
}