package com.srivastava.apps.aopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Pointcut("execution(void print*()) ")
		public void myPointCut() {
			
		}
		
		@Around("execution(void print*()) ")
		public void both(ProceedingJoinPoint jp) {
			System.out.println("Before Print Call");
			long startTime = System.currentTimeMillis();
			try {
				jp.proceed();
				long endTime = System.currentTimeMillis();
				System.out.println("After Print Call "+(endTime-startTime));
//				if(10>20) {
//				jp.proceed();
//				}
//				else {
//					return ;
//				}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		//@Before("myPointCut()")
		public void start() {
				System.out.println("Start Call");
		}
		//@After("myPointCut()")
		public void end() {
			System.out.println("End call");
		}
}
