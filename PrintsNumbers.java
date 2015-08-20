import java.io.*;
import java.util.*;
public class PrintsNumbers implements Runnable {

		public boolean keepGoing;
		
		public PrintsNumbers() {
			this. keepGoing=true;
				
	}

		public void stopPrinting () {
			keepGoing = false;
		}
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int count = 1;
			
			while(keepGoing) {
				System.out.println(count++);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e){
					
				}
			}
			
		}
}
