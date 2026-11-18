import java.util.Random;

public class questionBank {

    private Question[] questions;
    private Question currentQuestion;
    private Random rand;


    public questionBank(){


        questions = new Question[100];
        rand = new Random();
        populateQuestions();

    }




    private void populateQuestions(){


        // General Knowledge (25)

        questions[0] = new Question("What is the capital of Japan?",
                new String[]{"Seoul", "Tokyo", "Beijing", "Bangkok"}, 1);

        questions[1] = new Question("How many continents are there?",
                new String[]{"5", "6", "7", "8"}, 2);

        questions[2] = new Question("Which planet is known as the Red Planet?",
                new String[]{"Venus", "Mars", "Jupiter", "Mercury"}, 1);

        questions[3] = new Question("What is the largest ocean on Earth?",
                new String[]{"Atlantic", "Indian", "Arctic", "Pacific"}, 3);

        questions[4] = new Question("What is the chemical symbol for gold?",
                new String[]{"Ag", "Au", "Fe", "Go"}, 1);

        questions[5] = new Question("How many sides does a hexagon have?",
                new String[]{"5", "6", "7", "8"}, 1);

        questions[6] = new Question("Which country is home to the Great Pyramid of Giza?",
                new String[]{"Greece", "Mexico", "Egypt", "India"}, 2);

        questions[7] = new Question("What is the largest mammal in the world?",
                new String[]{"African Elephant", "Blue Whale", "Giraffe", "Orca"}, 1);

        questions[8] = new Question("What is the freezing point of water in Celsius?",
                new String[]{"0", "10", "32", "-10"}, 0);

        questions[9] = new Question("Which language is primarily spoken in Brazil?",
                new String[]{"Spanish", "Portuguese", "French", "Italian"}, 1);

        questions[10] = new Question("How many players are on the field for one soccer team?",
                new String[]{"9", "10", "11", "12"}, 2);

        questions[11] = new Question("Which instrument has 88 keys?",
                new String[]{"Guitar", "Violin", "Piano", "Harp"}, 2);

        questions[12] = new Question("What is the tallest mountain in the world?",
                new String[]{"K2", "Mount Everest", "Kilimanjaro", "Denali"}, 1);

        questions[13] = new Question("Which gas do plants absorb from the atmosphere?",
                new String[]{"Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"}, 2);

        questions[14] = new Question("How many degrees are in a right angle?",
                new String[]{"45", "90", "180", "360"}, 1);

        questions[15] = new Question("Which US state is known as the Sunshine State?",
                new String[]{"California", "Texas", "Florida", "Arizona"}, 2);

        questions[16] = new Question("What is the smallest prime number?",
                new String[]{"0", "1", "2", "3"}, 2);

        questions[17] = new Question("Which animal is known as the King of the Jungle?",
                new String[]{"Tiger", "Lion", "Elephant", "Leopard"}, 1);

        questions[18] = new Question("What is the currency of the United Kingdom?",
                new String[]{"Euro", "Dollar", "Pound Sterling", "Franc"}, 2);

        questions[19] = new Question("How many colors are traditionally in a rainbow?",
                new String[]{"5", "6", "7", "8"}, 2);

        questions[20] = new Question("Which organ pumps blood throughout the human body?",
                new String[]{"Lungs", "Brain", "Heart", "Liver"}, 2);

        questions[21] = new Question("What is the largest desert in the world?",
                new String[]{"Sahara", "Gobi", "Antarctic Desert", "Arabian Desert"}, 2);

        questions[22] = new Question("Which metal is liquid at room temperature?",
                new String[]{"Iron", "Mercury", "Copper", "Aluminum"}, 1);

        questions[23] = new Question("What is the primary ingredient in traditional guacamole?",
                new String[]{"Tomato", "Avocado", "Cucumber", "Pepper"}, 1);

        questions[24] = new Question("Which country invented paper?",
                new String[]{"Greece", "Egypt", "China", "India"}, 2);


        // Networking Concepts (25)

        questions[25] = new Question("What does IP stand for?",
                new String[]{"Internet Protocol", "Internal Process", "Internet Provider", "Information Program"}, 0);

        questions[26] = new Question("Which protocol is commonly used to securely browse websites?",
                new String[]{"HTTP", "FTP", "HTTPS", "SMTP"}, 2);

        questions[27] = new Question("What does DNS primarily do?",
                new String[]{"Encrypts data", "Translates domain names into IP addresses", "Blocks malware", "Assigns MAC addresses"}, 1);

        questions[28] = new Question("Which protocol is connection-oriented?",
                new String[]{"UDP", "IP", "TCP", "ICMP"}, 2);

        questions[29] = new Question("What is the default port for HTTP?",
                new String[]{"21", "25", "80", "443"}, 2);

        questions[30] = new Question("What is the default port for HTTPS?",
                new String[]{"80", "110", "443", "8080"}, 2);

        questions[31] = new Question("What device connects multiple networks together?",
                new String[]{"Switch", "Router", "Hub", "Repeater"}, 1);

        questions[32] = new Question("Which protocol is commonly used to automatically assign IP addresses?",
                new String[]{"DNS", "DHCP", "FTP", "SSH"}, 1);

        questions[33] = new Question("What does LAN stand for?",
                new String[]{"Large Area Network", "Local Area Network", "Linked Access Network", "Long Access Network"}, 1);

        questions[34] = new Question("Which OSI model layer is responsible for routing?",
                new String[]{"Physical", "Data Link", "Network", "Transport"}, 2);

        questions[35] = new Question("What does a MAC address identify?",
                new String[]{"A network interface", "A website", "A user account", "A server application"}, 0);

        questions[36] = new Question("Which protocol is used to transfer files?",
                new String[]{"FTP", "DNS", "ARP", "DHCP"}, 0);

        questions[37] = new Question("What does UDP stand for?",
                new String[]{"Universal Data Protocol", "User Datagram Protocol", "Unified Delivery Process", "User Data Process"}, 1);

        questions[38] = new Question("Which command is commonly used to test network connectivity?",
                new String[]{"mkdir", "ping", "copy", "format"}, 1);

        questions[39] = new Question("What is the loopback IPv4 address?",
                new String[]{"192.168.1.1", "10.0.0.1", "127.0.0.1", "255.255.255.0"}, 2);

        questions[40] = new Question("Which protocol is used to send email?",
                new String[]{"SMTP", "POP3", "IMAP", "DNS"}, 0);

        questions[41] = new Question("What does a subnet mask determine?",
                new String[]{"The device's MAC address", "The network and host portions of an IP address", "The default gateway", "The DNS server"}, 1);

        questions[42] = new Question("Which device typically operates at OSI Layer 2?",
                new String[]{"Router", "Switch", "Modem", "Firewall"}, 1);

        questions[43] = new Question("What does VPN stand for?",
                new String[]{"Virtual Private Network", "Verified Public Network", "Variable Protocol Network", "Virtual Protected Node"}, 0);

        questions[44] = new Question("Which protocol securely provides remote command-line access?",
                new String[]{"Telnet", "FTP", "SSH", "HTTP"}, 2);

        questions[45] = new Question("What is the purpose of a firewall?",
                new String[]{"Increase processor speed", "Filter network traffic", "Store files", "Assign IP addresses"}, 1);

        questions[46] = new Question("Which protocol translates IP addresses into MAC addresses on a local IPv4 network?",
                new String[]{"DNS", "ARP", "SMTP", "SNMP"}, 1);

        questions[47] = new Question("How many bits are in an IPv4 address?",
                new String[]{"16", "32", "64", "128"}, 1);

        questions[48] = new Question("Which protocol is commonly used to synchronize time across computers?",
                new String[]{"NTP", "FTP", "HTTP", "ARP"}, 0);

        questions[49] = new Question("What is the primary purpose of a default gateway?",
                new String[]{"Store passwords", "Forward traffic to other networks", "Resolve domain names", "Assign subnet masks"}, 1);


        // Programming Concepts (25)

        questions[50] = new Question("What is a variable?",
                new String[]{"A type of loop", "A named storage location for data", "A programming language", "A compiler"}, 1);

        questions[51] = new Question("Which data type typically stores true or false values?",
                new String[]{"String", "Integer", "Boolean", "Double"}, 2);

        questions[52] = new Question("What does a loop do?",
                new String[]{"Repeats a block of code", "Deletes variables", "Compiles a program", "Creates a class"}, 0);

        questions[53] = new Question("Which keyword is used to create a class in Java?",
                new String[]{"function", "class", "define", "object"}, 1);

        questions[54] = new Question("What does IDE stand for?",
                new String[]{"Integrated Development Environment", "Internal Data Engine", "Internet Development Extension", "Integrated Design Element"}, 0);

        questions[55] = new Question("Which symbol is commonly used for assignment in Java?",
                new String[]{"==", "=", "!=", ">"}, 1);

        questions[56] = new Question("What is an array?",
                new String[]{"A collection of elements", "A type of loop", "A network protocol", "A compiler"}, 0);

        questions[57] = new Question("What does OOP stand for?",
                new String[]{"Operational Output Processing", "Object-Oriented Programming", "Open Online Protocol", "Organized Object Process"}, 1);

        questions[58] = new Question("Which Java keyword creates a new object?",
                new String[]{"create", "make", "new", "object"}, 2);

        questions[59] = new Question("What is a function or method?",
                new String[]{"A reusable block of code", "A variable type", "A database", "A programming error"}, 0);

        questions[60] = new Question("What does a compiler do?",
                new String[]{"Executes network requests", "Translates source code into another form", "Stores files", "Creates databases"}, 1);

        questions[61] = new Question("Which operator checks equality in Java?",
                new String[]{"=", "==", "!=", "++"}, 1);

        questions[62] = new Question("What is an infinite loop?",
                new String[]{"A loop that runs only once", "A loop that never terminates", "A loop with no variables", "A loop that runs backward"}, 1);

        questions[63] = new Question("Which Java access modifier makes a member accessible from anywhere?",
                new String[]{"private", "protected", "public", "static"}, 2);

        questions[64] = new Question("What does null represent in Java?",
                new String[]{"The number zero", "An empty string", "No object reference", "False"}, 2);

        questions[65] = new Question("What is inheritance in object-oriented programming?",
                new String[]{"A class acquiring features from another class", "Deleting a class", "Creating a loop", "Converting data types"}, 0);

        questions[66] = new Question("Which data structure follows Last In, First Out?",
                new String[]{"Queue", "Stack", "Array", "Tree"}, 1);

        questions[67] = new Question("Which data structure follows First In, First Out?",
                new String[]{"Stack", "Queue", "Graph", "Tree"}, 1);

        questions[68] = new Question("What does an if statement do?",
                new String[]{"Repeats code", "Executes code based on a condition", "Creates a class", "Imports a library"}, 1);

        questions[69] = new Question("What is debugging?",
                new String[]{"Writing documentation", "Finding and fixing errors in code", "Compiling a program", "Installing software"}, 1);

        questions[70] = new Question("Which Java keyword prevents a variable from being reassigned?",
                new String[]{"static", "final", "private", "void"}, 1);

        questions[71] = new Question("What is recursion?",
                new String[]{"A method calling itself", "A loop with two conditions", "A type of array", "A programming language"}, 0);

        questions[72] = new Question("What does an API allow?",
                new String[]{"Programs to communicate with each other", "Computers to increase RAM", "Files to be compressed", "Users to change passwords"}, 0);

        questions[73] = new Question("What does Git primarily help developers do?",
                new String[]{"Manage version history", "Compile Java code", "Design websites", "Manage network hardware"}, 0);

        questions[74] = new Question("What is a syntax error?",
                new String[]{"An error caused by invalid code structure", "A slow internet connection", "A hardware failure", "An incorrect algorithm result"}, 0);


        // General Technology (20)

        questions[75] = new Question("What does CPU stand for?",
                new String[]{"Central Processing Unit", "Computer Power Utility", "Central Program User", "Core Processing Utility"}, 0);

        questions[76] = new Question("What does RAM stand for?",
                new String[]{"Read Access Memory", "Random Access Memory", "Rapid Application Module", "Remote Access Machine"}, 1);

        questions[77] = new Question("Which storage device typically has no moving mechanical parts?",
                new String[]{"HDD", "SSD", "DVD", "Floppy Disk"}, 1);

        questions[78] = new Question("What does GPU stand for?",
                new String[]{"General Processing Unit", "Graphics Processing Unit", "Graphical Program Utility", "Global Processing Unit"}, 1);

        questions[79] = new Question("Which of these is an operating system?",
                new String[]{"Python", "Linux", "HTML", "SQL"}, 1);

        questions[80] = new Question("What does USB stand for?",
                new String[]{"Universal Serial Bus", "Unified System Board", "Universal Storage Block", "User Service Bus"}, 0);

        questions[81] = new Question("Which company developed the Windows operating system?",
                new String[]{"Apple", "Google", "Microsoft", "IBM"}, 2);

        questions[82] = new Question("What is the primary purpose of an operating system?",
                new String[]{"Manage hardware and software resources", "Create websites", "Increase internet speed", "Encrypt every file"}, 0);

        questions[83] = new Question("Which unit is commonly used to measure processor clock speed?",
                new String[]{"Bytes", "Hertz", "Pixels", "Volts"}, 1);

        questions[84] = new Question("What does BIOS stand for?",
                new String[]{"Basic Input/Output System", "Binary Integrated Operating Software", "Basic Internet Operating Service", "Boot Input Operating Standard"}, 0);

        questions[85] = new Question("Which file extension is commonly associated with Java source code?",
                new String[]{".class", ".java", ".exe", ".jar"}, 1);

        questions[86] = new Question("What is the purpose of a UPS in computing?",
                new String[]{"Increase network speed", "Provide temporary backup power", "Cool the CPU", "Store backups"}, 1);

        questions[87] = new Question("Which technology is commonly used for wireless local area networking?",
                new String[]{"Bluetooth", "Wi-Fi", "NFC", "USB"}, 1);

        questions[88] = new Question("What does HTML primarily define?",
                new String[]{"Database structures", "Webpage structure", "Network routing", "Operating system processes"}, 1);

        questions[89] = new Question("Which component is primarily responsible for rendering graphics?",
                new String[]{"CPU", "RAM", "GPU", "PSU"}, 2);

        questions[90] = new Question("What does PDF stand for?",
                new String[]{"Portable Document Format", "Personal Data File", "Printed Document Folder", "Program Data Format"}, 0);

        questions[91] = new Question("Which type of memory is typically volatile?",
                new String[]{"SSD", "HDD", "RAM", "Flash memory"}, 2);

        questions[92] = new Question("What is the primary purpose of encryption?",
                new String[]{"Compress data", "Protect information from unauthorized access", "Increase storage capacity", "Improve processor speed"}, 1);

        questions[93] = new Question("Which company developed the Android operating system?",
                new String[]{"Microsoft", "Apple", "Google", "Intel"}, 2);

        questions[94] = new Question("What does SSD stand for?",
                new String[]{"Solid State Drive", "System Storage Device", "Serial Storage Disk", "Secure System Drive"}, 0);




        //questions i thought of (5)

        questions[95] = new Question("What is the airspeed velocity of an unlaiden swallow", new String[]{"20m/s","10m/s","5m/s","i dont know"},3);
        questions[96] = new Question("What is your favorite color",new String[]{"Blue","Green","Red","Orange"}, 0);
        questions[97] = new Question("What is the answer to life, the universe and everything",new String[]{"27","64","42","11"},2);
        questions[98] = new Question("What is 2+2",new String[]{"1","2","3","4"},3);
        questions[99] = new Question("What order do the candy corn colors go in from bottom to top",new String[]{"White,Orange,Yellow","Yellow,Orange,White","Orange,White,Yellow","Yellow,White,Orange"},1);


    }



    public Question getNewQuestion(){
        Question newQuestion;

        do{newQuestion = questions[rand.nextInt(questions.length)];



        } while (newQuestion == currentQuestion);

        currentQuestion = newQuestion;
        return currentQuestion;
    }


    public Question getCurrentQuestion(){
        return currentQuestion;
    }
}
