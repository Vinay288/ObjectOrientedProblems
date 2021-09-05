package com.bridgelabz.CommercialDataProcessing;

import java.util.Date;

import com.bridgelabz.linkedlistproblem.MyLinkedList;
import com.bridgelabz.linkedlistproblem.Node;
import com.bridgelabz.stackandqueueproblem.MyQueue;
import com.bridgelabz.stackandqueueproblem.MyStack;

public class StockAccount implements StockAccountIf {

	private MyLinkedList<CompanyShares> myLinkedList;
	private int totalNumberOfComapny = 0;
	private CompanyShares companyShares;
	private Node<CompanyShares> newNode;
	private com.bridgelabz.stackandqueueproblem.Node<String> stackNode;
	private MyStack<String> myStack;
	private com.bridgelabz.stackandqueueproblem.Node<Date> queueNode;
	private MyQueue<Date> myQueue;

	public StockAccount(int numberOfCompany) {
		myLinkedList = new MyLinkedList<CompanyShares>();
		myStack = new MyStack<String>();
		myQueue=new MyQueue<Date>();
	}

	@Override
	public void buy(int amount, String symbol) {
		newNode = (Node) myLinkedList.getHead();
		while (newNode != null) {
			if (newNode.getKey().getStockSymbol().equals(symbol)) {
				newNode.getKey().setNumberOfShares(newNode.getKey().getNumberOfShares() + amount);
				newNode.getKey().setTransctionTime(new Date());
				stackNode = new com.bridgelabz.stackandqueueproblem.Node<String>(symbol);
				myStack.push(stackNode);
				queueNode= new com.bridgelabz.stackandqueueproblem.Node<Date>(new Date());
				myQueue.addRear(queueNode);
				return;
			}
			newNode = (Node<CompanyShares>) newNode.getNext();
		}
		Node<CompanyShares> newNode = new Node<CompanyShares>(new CompanyShares(symbol, amount, new Date()));
		myLinkedList.append(newNode);
		stackNode = new com.bridgelabz.stackandqueueproblem.Node<String>(symbol);
		myStack.push(stackNode);
		queueNode= new com.bridgelabz.stackandqueueproblem.Node<Date>(new Date());
		myQueue.addRear(queueNode);
	}

	@Override
	public void sell(int amount, String symbol) {
		newNode = (Node) myLinkedList.getHead();
		while (newNode != null) {
			if (newNode.getKey().getStockSymbol().equals(symbol)) {
				float totalAmount = (newNode.getKey().getNumberOfShares() + amount) > 0
						? newNode.getKey().getNumberOfShares() - amount
						: 0;
				newNode.getKey().setNumberOfShares(totalAmount);
				newNode.getKey().setTransctionTime(new Date());
				stackNode = new com.bridgelabz.stackandqueueproblem.Node<String>(symbol);
				myStack.push(stackNode);
				queueNode= new com.bridgelabz.stackandqueueproblem.Node<Date>(new Date());
				myQueue.addRear(queueNode);
				return;
			}
			newNode = (Node<CompanyShares>) newNode.getNext();
		}
		System.out.println("not found");
	}

	@Override
	public void save(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printReport() {
		newNode = (Node) myLinkedList.getHead();
		float total = 0f;
		myLinkedList.printMyNodes();
		System.out.println("");
		while (newNode != null) {
			System.out.println("company Symbol " + newNode.getKey().getStockSymbol());
			System.out.println("company shares " + newNode.getKey().getNumberOfShares());
			total += newNode.getKey().getNumberOfShares();
			System.out.println("recent tranaction info " + newNode.getKey().getTransctionTime());
			newNode = (Node<CompanyShares>) newNode.getNext();
		}
		System.out.println("total is " + total);
		System.out.println("transaction details are as follows");
		myStack.printMyNodes();
		myQueue.printMyNodes();
	}

	@Override
	public double valueOf() {
		double totalAmount = 0f;
		newNode = (Node) myLinkedList.getHead();
		while (newNode != null) {
			totalAmount += newNode.getKey().getNumberOfShares();
		}
		return totalAmount;
	}

}
