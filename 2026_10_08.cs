using System;

namespace ConsoleApp1
{
    internal class _2026_10_08
    {
        public class HowardTech
        {
            public virtual void MakeReactor()
            {
                Console.WriteLine("일반 기술");
            }
        }
        public class TonyTech : HowardTech
        {
            public override void MakeReactor()
            {
                Console.WriteLine("고급 기술");
            }
        }
        static void Main()
        {
            HowardTech factory = new TonyTech();
            factory.MakeReactor();
            Console.WriteLine("-----------");
            TonyTech ironMan = new TonyTech();
            ironMan.MakeReactor();
        }
    }
}
