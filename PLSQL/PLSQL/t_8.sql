create procedure [dbo].[t_8]
AS
BEGIN
select customer_name, borrower.loan_number, amount from   borrower, loan where  borrower.loan_number = loan.loan_number  and        branch_name = 'Perryridge'; 
 select depositor.customer_name, account.account_number, balance from   depositor, account where  depositor.account_number = account.account_number ; 
 
 
 
 
 
END;