fun respect(a : Int, b : Int) : Int
{
    var x = a
    var y = b
    while (x != y)
    {
        if (x > y) x = x - y
        else y = y - x
    }
    return y

}
//Fajny kod Euklidesa oddejmowanie