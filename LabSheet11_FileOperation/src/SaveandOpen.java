import java.io.IOException;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
public class SaveandOpen extends Employee{
	
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		Scanner input = new Scanner(System.in);
		//ประกาศ object ชื่อ writFile เำื่อบัทึกข้อมูลลงไฟล์โดยใช้คลาส PrintStream
		PrintWriter writeFile = new PrintWriter(new FileWriter("src//txtFile//employee.txt",true));
		String answer;
		do {
			super.header();
			//รับข้อมูลชื่อกับแผนกทง keyboard 
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter departmaent: ");
			dept = input.next();
			System.out.print("DO you want to input data again? : ");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
		}
		public void searchData() {
			try {
				//ใช้ class Scanner สำหรับเปิดอ่านไฟล์
				Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
				int i=0;
				boolean check = false;
				super.header();
				while(readFile.hasNext()) {
					name = readFile.next();
					dept = readFile.next(); //ตัวแปร dept ในไฟล์ employee
					
					
					if(dept.equalsIgnoreCase(super.getDept())) {
						i++;
						System.out.println(i+")"+ name);
						check = true;					
					}
				}//end while	
				if(check) {
					super.header();
					System.out.print("Employee in dept "+ super.getDept()+
							" is "+ i +" person(s).");
					System.out.println();
					super.header();
				}
				else {
					System.out.println("\nSorry, no dept: "+super.getDept()+
							" in file.");
				}					
				
			}catch(IOException e) {
				System.out.println("\nSorry, file not found...");
			}		
			
		}//end searchData()	
	}
