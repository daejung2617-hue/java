using System;

namespace gameProject
{
    internal class Program
    {
        static void showData()
        {
            Console.WriteLine("외부데이터 없이 자체 동작");
        }

        static int devide(int x, int y)
        {
            if (y != 0)
            {
                int retval;
                retval = x/y;
                Console.WriteLine("{0} {1}을 나눈값 {2}", x, y, retval);
            }
            else
            {
                Console.WriteLine("0으로 나눌 수 없음");
                return 0;
            }
        }
        
        static void Main(string[] args)
        {
            showData();
            devide(7, 3);
            devide(0, 3);

        }
    }
}
