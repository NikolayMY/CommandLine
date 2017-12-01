package utils.help;

public class HelpImpl implements Help{

    @Override
    public void provideHelp() {
        System.out.println(" 'ls'   ---   Shows all files in current directory "+
        "\n 'cd'   ---   Changes current directory ('/' and '\\' and '//' options are acceptable)"+
        "\n 'pwd'   ---   Shows current user's directory" +
        "\n 'mkdir ${dir}'   ---  Creates directory with 'dir' name" +
        "\n 'config' --- Displays system information " +
        "\n 'help'    ---   Provides information about command's list" +
        "\n 'scan ${host}' --- Scanning entered host for open ports " +
                "\n          'scan ${host} ${port}' or 'scan ${host} ${from} ${to} are acceptable'" +
        "\n       add v for visual status displaying" +
        "\n 'exit' or 'bye' --- Exit the Command Line");
    }
}
