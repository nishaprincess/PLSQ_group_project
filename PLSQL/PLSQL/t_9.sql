create procedure [dbo].[t_9]
AS
BEGIN
select depositor.customer_name, account.account_number, balance from   depositor, account where  depositor.account_number = account.account_number and balance <= 400 ;   
 
 
 
END;