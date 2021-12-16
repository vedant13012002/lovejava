public class lovejava {
    public static void main(String[] args) {
        
        try
        {
            System.out.println("Java");
            throw new Exception();

        }
        catch (Exception e)
        {
            try
            {
                try
                {
                    throw new Exception();

                }
                catch (Exception ex)
                {
                    System.out.println("Is");
                }
                throw new Exception();

            }
            catch(Exception exc)
            {
                System.out.println("The");
            }
            finally {
                System.out.println("Best");

            }
        }
        
        finally {
            System.out.println("Programming");
        }
        System.out.println("Language");
    }
}

