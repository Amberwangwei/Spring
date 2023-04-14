package lab2.ex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class PrintBeforeAdvice {
	@Around("execution(* lab2.ex3.Product.*(..))")
	public Object before(ProceedingJoinPoint jointPoint) {
	
	System.out.println("這是PrintBeforeAdvice所加入的消息:"
	+jointPoint.getSignature().getDeclaringTypeName()+"."
	+jointPoint.getSignature().getName());
	long start =System.nanoTime();
	Object obj =null;
	try {
		obj = jointPoint.proceed();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	long end =System.nanoTime();
	
	System.out.println("Time:"+(end-start)+"ns.");
	return obj;
	}
	
}
