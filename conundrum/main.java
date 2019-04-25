import java.util.Scanner;


class Main {
 public static void main(String[] args)
  {
    Scanner myObj = new Scanner(System.in);
    String userName = myObj.nextLine();
    System.out.print(CipherCal(userName));
  }

  public static int CipherCal(String text){
    int counter = 0;
    char[] str_arr = text.toCharArray();
    for(int n = 0; n<text.length(); n++){

          switch(n % 3)
		{
			case 0:
			if(str_arr[n]!='P')
				counter++;
			break;
			case 1:
			if(str_arr[n]!='E')
				counter++;
			break;
			case 2:
			if(str_arr[n]!='R')
				counter++;
			break;
		}
     }

    return counter;
  }
}
