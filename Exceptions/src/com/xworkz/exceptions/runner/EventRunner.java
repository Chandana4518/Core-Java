package com.xworkz.exceptions.runner;


import java.lang.invoke.WrongMethodTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.FileSystemAlreadyExistsException;

import java.time.DateTimeException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.RejectedExecutionException;

import javax.management.JMRuntimeException;

import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;



public class EventRunner extends RuntimeException{

	public static void main(String[] args) {
		
		int index=19;
		
		if(index==0)
		{
		throw new ArithmeticException("index value is 0");
		}
		else if(index==1)
		{
			throw new ArrayStoreException("Index value is 1");
		}
		else if(index==2)
		{
			throw new WrongMethodTypeException("Index value is 2");
		}
		else if(index==3)
		{
			throw new IllegalArgumentException("Index value is 3");
		}
		else if(index==4)
		{
			throw new IllegalAccessError("Index value is 4");
		}
		else if(index==5)
		{
			throw new JMRuntimeException("Index value is 5");
		}
		else if(index==6)
		{
			throw new IndexOutOfBoundsException("Index value is 6");
		}
		else if(index==7)
		{
			throw new BufferUnderflowException();
		}
		else if(index==8)
		{
			throw new BufferOverflowException();
		}
		else if(index==9)
		{
			throw new CannotRedoException();
		}
		else if(index==10)
		{
			throw new CannotUndoException();
		}
		else if(index==11)
		{
			throw new ClassCastException("Index value is 11");
		}
		else if(index==12)
		{
			throw new DateTimeException(null);
		}
		else if(index==13)
		{
			throw new NegativeArraySizeException("Index value is 13");
		}
		else if(index==14)
		{
			throw new EmptyStackException();
		}
		else if(index==15)
		{
			throw new FileSystemAlreadyExistsException("Index value is 15");
		}
		else if(index==16)
		{
			throw new RejectedExecutionException("Index value is 16");
		}
		else if(index==17)
		{
			throw new MissingFormatArgumentException(null);
		}
		else if(index==18)
		{
			throw new ConcurrentModificationException("Index value is 18");
		}
		else if(index==19)
		{
			throw new IllegalMonitorStateException("Index value is 19");
		}
		
		

	}

}
