create procedure [dbo].[t_5]
AS
BEGIN
select account_number, balance from account where  balance > 800 and branch_name = 'Brighton' ; 
 
 
 
 
 
END;