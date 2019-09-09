int[] num;
import java.util.Random;
void setup(){
  size(500,500);
  num=new int[width];
  noStroke();
}
void draw(){
  background(#F71616, #28F716, #162EF7);
  for(int i=0; i<num.length; i++){
    rect(i, height, 1,-i); 
  }
  stepSort(num);
  if(mousePressed){
   Random(); 
  }
}
void Random(){
  for(int i=0; i<num.length; i++){
   int counter=new Random().nextInt(height); 
  }
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
