-----------------------ACID------------------------
-------THESE ARE THE PROPERTIES OF A TRANSACTION
--ATOMIC
--CONSISTENT
--ISOLATED
--DURABLE

----atomic
--each transaction should be all or nothing, we cannot perform half 
----a commit or part of a transaction

----consistent
--when we commit, the state properly changes and is consistent for the next
----transaction. also, it ensures that all transactions follow rules for
----the tables, such as constraints.

----isolated
--transactions work without interference of each other. when we have multiple
----transactions working concurrently, we get the same result as if they were 
----all ran sequentially.

----durable
--if the system fails, the database still holds the data from the last transaction.



