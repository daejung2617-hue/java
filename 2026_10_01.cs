using System;
using static System.Runtime.InteropServices.JavaScript.JSType;
namespace gameProject
{
    internal class Program
    {
        class Mydata
        {
            public int m_x, m_y;
            private int m_z;
            protected int m_abe;
            public Mydata(int x, int y, int z)
            {
                Console.WriteLine("생성자 값3개 세팅");
                m_x = x;
                m_y = y;
                m_z = z;
            }
            public Mydata()
            {
                Console.WriteLine("생성자 :값없이 기본값으로 세팅");
            }
            public Mydata(int x)
            {
                Console.WriteLine("생산자 값1개 세팅");
                m_x = x;
                m_y = 0;
                m_z = 0;
            }

            public Mydata(int y =33, int z = 66)
            {
                Console.WriteLine("생산자 값2개 세팅");
                m_x = 3;
                m_y = y;
                m_z = z;
            }
            public void ShowData()
            {
                Console.WriteLine("내부 {0} {1} {2}",m_x,m_y,m_z);
            }
            static void Main(string[] args)
            {
                Console.WriteLine("클래스 변수 data"); ;
                Mydata data = new Mydata();
                data.ShowData();
                Console.WriteLine("______________");

                Console.WriteLine("클래스 변수 data2"); ;
                Mydata data2 = new Mydata(x: 123, z: 456, y: 000);
                data2.ShowData();
                Console.WriteLine("______________");
                Console.WriteLine("클래스 변수 data3"); ;
                Mydata data3 = new Mydata(222,333);
                data3.ShowData();
                Console.WriteLine("______________");
                Console.WriteLine("클래스 변수 data4"); ;
                Mydata data4 = new Mydata(z: 44);
                data4.ShowData();
                Console.WriteLine("______________");
            }
        }
    }
}
