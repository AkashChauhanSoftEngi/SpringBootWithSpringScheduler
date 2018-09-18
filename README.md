# SpringBootWithSpringScheduler

* If application is up, your scheduler will run, even if no api or controler is called
* Spring Scheduler is a part of Spring, no seperate jar is required
* All the scheduled methods should follow the following two criteria -
  - The method should have a void return type.
  - The method should not accept any arguments.
* We need to add @EnableSheduling with main method class or with component class
* If we do not create @Scheduled method class as a bean, it would not run/work automatically
* Refrence: https://www.callicoder.com/spring-boot-task-scheduling-with-scheduled-annotation/
* Annotations
```
	- @Scheduled(fixedRate = 2000)
	- @Scheduled(fixedDelay = 2000)
	- @Scheduled(initialDelay = 2000)
	- @Scheduled(cron = "0 * * * * ?")
```

* fixedRate 	 : makes Spring run the task on periodic intervals even if the last invocation may still be running.
* fixedDelay 	 : specifically controls the next execution time when the last execution finishes.
* initialDelay 	 : first execution of the task will be delayed by 5 seconds
* Cron expression: cron = "0 * * * * ?"
```text
	- second, minute, hour, day of month, month, day(s) of week
	- (*) means match any
	- */X means "every X"
	- ? ("no specific value")
	- 0 no use[would not matter]
```
