package Task;

public class Alphabets {
	public static void main(String[] args) {
		Alphabets obj = new Alphabets();		
//		obj.Print_A();
//		obj.Print_B();
//		obj.Print_C();
//		obj.Print_D();
//		obj.Print_E();
//		obj.Print_F();
//		obj.Print_G();
//		obj.Print_H();
//		obj.Print_I();	
//		obj.Print_J();
//		obj.Print_K();
//		obj.Print_L();
//		obj.Print_M();
//		obj.Print_N();
//		obj.Print_O();
//		obj.Print_P();
//		obj.Print_Q();
//		obj.Print_R();
//		obj.Print_S();
//		obj.Print_T();
//		obj.Print_U();
//		obj.Print_V();
//		obj.Print_W();
//		obj.Print_X();
//		obj.Print_Y();
//		obj.Print_Z();
		}
	private void Print_A() {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			if(i<=4){
				for(int a=1;a<=7;a++) {
					if(i==4||i+a==5||a-i==3) {
					System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
			}
			else {
			for(int j=1;j<=7;j++) {
				if(j==1||j==7) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}
	
	private void Print_B() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==7) {
				 for(int i=1;i<=7;i++) {
					 if(i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
		 for(int row=1;row<=7;row++) {
			 if(row==7) {
				 for(int i=1;i<=7;i++) {
					 if(i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	private void Print_C() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==7) {
				 for(int i=1;i<=7;i++) {
					 if(i==1||i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	private void Print_D() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==7) {
				 for(int i=1;i<=6;i++) {
					 System.out.print("* ");
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}

	private void Print_E() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==4||row==7) {
				 for(int i=1;i<=7;i++) {
					 System.out.print("* ");
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}

	private void Print_F() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==4) {
				 for(int i=1;i<=7;i++) {
					 System.out.print("* ");
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}

	private void Print_G() {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			if(i==1||i==7||i==4) {
				for(int g=1;g<=7;g++) {
					if(g==1||g==7) {
						if(i==4) {
							System.out.print("* ");
							}
						else {
						System.out.print("  ");
						}
					}
					else {
					System.out.print("* ");
					}
				}
			}
			else {
			for(int j=1;j<=7;j++) {
				if(j==1||j==7) {
					if(i<4) {
						if(j==1) {
							System.out.print("* ");
						}
						else {
						System.out.print("  ");
						}
					}
					else {
					System.out.print("* ");
					}
				}
				else {
				System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}
	

	private void Print_H() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==4) {
				 for(int i=1;i<=7;i++) {
					 System.out.print("* ");
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	private void Print_I() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==7) {
				 for(int i=1;i<=7;i++) {
					 System.out.print("* ");
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==4) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	private void Print_J() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			 if(row==7) {
				 for(int i=1;i<=7;i++) {
					 if(i==2||i==1||i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==7||col==2) {
					 if(col==2&&row<4) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	private void Print_K() {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			if(i<=7) {
				for(int k=1;k<=7;k++) {
					if(k==1||k+i==5||i-k==3) {
						System.out.print("* ");
					}
					else {
					System.out.print("  ");
					}
				}
			}
			else {
			for(int j=1;j<=7;j++) {
				if(j==1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}	
			}
			}
			System.out.println();
		}
	}
	
	private void Print_L() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==7) {
				 for(int i=1;i<=7;i++) {
					 System.out.print("* ");
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}

	private void Print_M() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row<=4) {
				 for(int i=1;i<=7;i++) {
					 if(row==i||row+i==8||i==1||i==7) {
					 System.out.print("* ");
					 }
					 else {
						 System.out.print("  ");
					 }
				 }
			 }
			 else{
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	private void Print_N() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==7) {
				 for(int i=1;i<=7;i++) {
					 if(i==1||i==7) {
						 System.out.print("* ");
					 }
					 else {
					 System.out.print("  ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7||col==row) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	private void Print_O() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==7) {
				 for(int i=1;i<=7;i++) {
					 if(i==1||i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}

	private void Print_P() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			 if(row==1||row==7) {
				 for(int i=1;i<=7;i++) {
					 if(i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
		for(int i=1;i<=5;i++) {
			System.out.println("* ");
		}
	}
	
	private void Print_Q() {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			if(i==1||i==7) {
				 for(int q=1;q<=7;q++) {
					 if(q==1||q==7) {
						 System.out.print(" ");
					 }
					 else {
					 System.out.print(" *");
					 }
				 }
			}
			else {
			for(int j=1;j<=7;j++) {
				if(j==1||j==7) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=8;j++) {
				if(j-i==4) {
					System.out.print("* ");
					}
				else {
					System.out.print("  ");
					}
				}
					System.out.println();
		}
	}
	
	private void Print_R() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1) {
				 for(int i=1;i<=7;i++) {
					 if(i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
		 for(int row=1;row<=7;row++) {
			 if(row==1) {
				 for(int i=1;i<=7;i++) {
					 if(i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	
	private void Print_S() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			if(i==1) {
					 for(int s=1;s<=7;s++) {
						 if(s==1||s==7) {
							 System.out.print("  ");
						 }
						 else {
						 System.out.print("* ");
						 }
					 }
				}
			else {
			for(int j=1;j<=7;j++) {
				if(j==1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			if(i==1||i==5) {
					 for(int s=1;s<=7;s++) {
						 if(s==1||s==7) {
							 System.out.print("  ");
						 }
						 else {
						 System.out.print("* ");
						 }
					 }
				}
			else {
			for(int j=1;j<=7;j++) {
				if(j==7) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}

	private void Print_T() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1) {
				 for(int i=1;i<=7;i++) {
					 System.out.print("* ");
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==4) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}

	private void Print_U() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==7) {
				 for(int i=1;i<=7;i++) {
					 if(i==1||i==7) {
						 System.out.print("  ");
					 }
					 else {
					 System.out.print("* ");
					 }
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==1||col==7) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}
	
	private void Print_V() {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if(i==j||i+j==8) {
					if(j==4) {
						System.out.print("*");
					}
					else {
						System.out.print("* ");
						}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private void Print_W() {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			if(i>=4) {
				for(int w=1;w<=7;w++) {
					if(w==1||w==7||i+w==8||i==w){
						System.out.print("* ");
					}
					else {
					System.out.print("  ");
					}
				}
			}
			else {
			for(int j=1;j<=7;j++) {
				if(j==1||j==7){
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}

	private void Print_X() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row<=7) {
				for(int i=1;i<=7;i++) {
					if(i==row||row+i==8) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			else {
			for(int col=1;col<=7;col++) {
				if(col==1||col==7){
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			}
			System.out.println();
		}
	}

	private void Print_Y() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row<=4) {
				 for(int y=1;y<=7;y++) {
					 if(y==row||row+y==8) {
					 System.out.print("* ");
					 }
					 else {
						 System.out.print("  ");
					 }
				 }
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col==4) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 }
			 System.out.println();
		 }
	}

	private void Print_Z() {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++) {
			 if(row==1||row==7) {
				 for(int i=1;i<=7;i++) {
					 System.out.print("* ");
				 }
				 
			 }
			 else {
			 for(int col=1;col<=7;col++) {
				 if(col+row==8) {
					 System.out.print("* ");
				 }
					 System.out.print("  ");
			 }
			 }
			 System.out.println();
		 }
	}	

}