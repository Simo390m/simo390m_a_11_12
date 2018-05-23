package SorteOpgaver.ch11.aske1208_a_11_12;

import java.util.*;

public class twelve
{
    public boolean contains3(List<String> list)
    {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++)
        {
            map.put(i, list.get(i));
        }

        for (String string : list)
        {
            if (Collections.frequency(map.values(), string) == 3)
            {
                return true;
            }
        }

        return false;
    }
}
