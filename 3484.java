class Spreadsheet {
    int[] ss;

    public Spreadsheet(int rows) {
        ss = new int[rows * 26];
        // System.out.println(rows+" -> Spreadsheet: "+ss.length);
    }

    public void setCell(String cell, int value) {
        int arr[] = getAdd(cell);
        // System.out.println(cell+" -> getAdd: "+Arrays.toString(arr));
        ss[((arr[1]) * 26) + arr[0]] = value;
        // System.out.println(((arr[1]*26)+arr[0])+" -> setCell: "+value);
    }

    public void resetCell(String cell) {
        setCell(cell, 0);
        // System.out.print("reSetCell -> ");
    }

    public int getValue(String formula) {
        int arr[] = getAdd(formula);
        // System.out.println(formula+" -> getAdd: "+Arrays.toString(arr));
        if (arr.length == 4) {
            int sum = 0;
            for (int i = 0; i < 4; i += 2) {
                if (arr[i] == -1)
                    sum += arr[i + 1];
                else
                    sum += ss[(arr[i + 1] * 26) + arr[i]];
            }
            // System.out.println("-- getValue: "+sum);
            return sum;
        }
        // System.out.println("-- getValue: "+arr[0]);
        return arr[0];
    }

    public int[] getAdd(String s) {
        if (s.charAt(0) == '=') {
            s = s.substring(1);
            String arr[] = s.split("\\+");
            if ((arr[0].charAt(0) < 58) && (arr[1].charAt(0) < 58))
                return new int[] {
                        Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])
                };
            int res[] = new int[4];
            for (int f = 0, h = 0; f < 2; f++, h += 2) {
                if (arr[f].charAt(0) > 64) {
                    res[h] = arr[f].charAt(0) - 'A';
                    res[h + 1] = Integer.parseInt(arr[f].substring(1)) - 1;
                } else {
                    res[h] = -1;
                    res[h + 1] = Integer.parseInt(arr[f]);
                }

                // System.out.println(s+" -> getAdd: "+Arrays.toString(res));
            }
            return res;
        }
        return new int[] { (s.charAt(0) - 'A'), Integer.parseInt(s.substring(1)) - 1 };
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */