create procedure [dbo].[t_6]
AS
BEGIN
select branch_name, (assets / 1000) as 'assets in thousands' from branch ; 
 
 
 
 
 
END;