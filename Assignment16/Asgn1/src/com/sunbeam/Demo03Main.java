package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo03Main 
{

	public static int menu(Scanner sc) 
	{
		int choice;

		System.out.println("*********************************************");
		System.out.println("1.Delete By Id.");
		System.out.println("2.Find All.");
		System.out.println("3.Find By Party.");
		System.out.println("4.Incremen tVote.");
		System.out.println("5.Save.");
		System.out.println("6.Update.");
		System.out.println("7.Party Wise Votes.");
		System.out.println("*********************************************");
		System.out.print("Enter Choice:");
		choice = sc.nextInt();
		System.out.println("*********************************************");

		return choice;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<PartyVotes> list1 = new ArrayList<>();
		int choice;
		
		
		while((choice  = menu(sc))!= 0)
		{
			switch (choice) 
			{
			case 1:
				
				try(CandidateDao dao = new CandidateDao()) 
				{
					System.out.print("Enter candidate id to be deleted: ");
					int id = sc.nextInt();
					int cnt = dao.deleteById(id);
					System.out.println("Candidates deleted: " + cnt);
				} // dao.close();
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				break;
				
			case 2:
				
				try(CandidateDao dao = new CandidateDao()) 
				{
					List<Candidate> list = dao.findAll();
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				break;
				
			case 3:
				
				try(CandidateDao dao = new CandidateDao()) 
				{
					System.out.print("Enter party: ");
					String party = sc.next();
					List<Candidate> list = dao.findByParty(party);
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				break;
			case 4:
				
				try(CandidateDao dao = new CandidateDao()) 
				{
					System.out.print("Enter candidate id (to vote): ");
					int candidateId = sc.nextInt();
					int cnt = dao.incrementVote(candidateId);
					System.out.println("Rows updated: " + cnt);
				} // dao.close();
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				
				break;
			case 5:
				
				try(CandidateDao dao = new CandidateDao()){
					
					Candidate c = new Candidate();
					c.accept();
					int cnt = dao.save(c);
					System.out.println("Row Inserted: "+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
			case 6:
				
				try(CandidateDao dao = new CandidateDao())
				{
					System.out.print("Enter id To Update: ");
					int id = sc.nextInt();
					System.out.print("Enter Name To Update: ");
					String name = sc.next();
					System.out.print("Enter Party To Update: ");
					String party = sc.next();
					
					Candidate c = new Candidate();
					c.setId(id);
					c.setName(name);
					c.setParty(party);
					int cnt = dao.update(c);
					System.out.println("Row Updated: " +cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
			case 7:
				
				try(CandidateDao dao = new CandidateDao())
				{
					System.out.print("Enter Party name to Count Votes:");
					String checkParty = sc.next();
					PartyVotes pv = new PartyVotes();
					list1.add(dao.getPartyWiseVotes(pv, checkParty));
					list1.forEach(c -> System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
				break;

			default:
				
				System.out.println("Wrong Choice............");
				
				break;
			}
		}
		
		System.out.println("Thank You.");
		
	}
}
