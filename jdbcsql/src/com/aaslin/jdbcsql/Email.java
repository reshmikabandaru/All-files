package com.aaslin.jdbcsql;



	import java.util.*;;
	public class Email {
	

	         public static String Email(String subscriber, String topic) {
		        StringBuilder sb = new StringBuilder();
		        
		        sb.append("Dear ").append(subscriber).append(",\n\n\n");
		        if(topic.equals("java"))
		        {
		        sb.append(topic);
		        
		        
		        sb.append(" Java is a high-level, class-based, object-oriented programming language that designed to have as few implementation ");
		        sb.append("\ndependencies as possible. It is a general-purpose programming language intended to let application developers \"write");
		        sb.append("\nonce, run anywhere\" (WORA), meaning that compiled Java code can run on all platforms that support Java without the ");
		        sb.append("\nneed for recompilation. ");
		        sb.append("\n\nThanks and Regards,");
		        sb.append("\n"+subscriber);
		      
		        }
		        else
		        {
		        	sb.append(" Python is a general-purpose language, used to create a range ");
			        sb.append("\nof applications, including data science, software and web");
			        sb.append("\ndevelopment, automation, and improving the ease of everyday");
			        sb.append("\ntasks. ");
			        sb.append("\n\nThanks and Regards,");
			        sb.append("\n"+subscriber);
		        }
		           return sb.toString();

		        }
	         
	         
		    public static void main(String[] args) {
				 Scanner sc = new Scanner(System.in);
				 System.out.print("SUBSCRIBER ");
				 String subscriber = sc.nextLine();
				 
			 	  System.out.print("\nTOPIC ");
			      String topic = sc.next();
	  
			      String EMAIL = Email(subscriber, topic);
			        
			        System.out.println(EMAIL);
			   }
		}


