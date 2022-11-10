import java.util.ArrayList;
import java.util.LinkedList;

//Author: Yetkin Aslan github: yetkinsln                2022 Javelin Foundation


public class main{
public static void main(String[] args){
//Create an arraylist and a linked list
ArrayList<Integer> arrayList1 = new ArrayList<>();
LinkedList<Integer> linkedList1 = new LinkedList<>();

//Create Threads
Thread arrayListThread = new Thread(new Runnable() {
    //Override Run Function(Adding 20000 number to ArrayList's different index)
@Override
public void run() {
 
  for(int i =0; i<20000; i++){
    arrayList1.add(i);
  }
}
});
Thread linkedListThread = new Thread(new Runnable() {
    //Override Run Function(Adding 20000 number to LinkedList's different index)
@Override
public void run() {
 
  for(int i =0; i<20000; i++){
    linkedList1.add(i);
  }
}
});
Thread linkedListThreadwi = new Thread(new Runnable() {
    //Override Run Function(Adding 20000 number to LinkedList's different index)
@Override
public void run() {
 
  for(int i =0; i<20000; i++){
    linkedList1.add(0,i);
  }
}
});
Thread arrayListThreadwi = new Thread(new Runnable() {
    //Override Run Function(Adding 20000 number to ArrayList's 0 index)
@Override
public void run() {
 
  for(int i =0; i<20000; i++){
    arrayList1.add(0,i);
  }
}
});
long time1 = System.currentTimeMillis();
arrayListThread.start();
try {
    arrayListThread.join();
} catch (InterruptedException e) {
    //generated catch block
    e.printStackTrace();
}
System.out.println("ArrayList adding items to different index speed: " + (System.currentTimeMillis()-time1 + " ms"));
long time2 = System.currentTimeMillis();
arrayListThreadwi.start();
try {
    arrayListThreadwi.join();
} catch (InterruptedException e) {
    //generated catch block
    e.printStackTrace();
}
System.out.println("ArrayList adding items to 0 index speed: " + (System.currentTimeMillis()-time2 + " ms"));
long time3 = System.currentTimeMillis();
linkedListThread.start();
try {
    linkedListThread.join();
} catch (InterruptedException e) {
    //generated catch block
    e.printStackTrace();
}
System.out.println("linkedList adding items to different index speed: " + (System.currentTimeMillis()-time3 + " ms"));
long time4 = System.currentTimeMillis();
linkedListThreadwi.start();
try {
    linkedListThreadwi.join();
} catch (InterruptedException e) {
    //generated catch block
    e.printStackTrace();
}
System.out.println("linkedList adding items to 0 index speed: " + (System.currentTimeMillis()-time4 + " ms"));
System.out.println("As a result, it makes more sense to use an ArrayList if values are to be assigned to different indexes, but a linkedlist is more appropriate if the same index value is to be assigned over and over again.However, since the speed disadvantage of the linklist when assigning to different indexes is not very high, I think linkedlist should almost always be used.");
}
}
