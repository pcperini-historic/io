#io#

`public class io`

A simplification of Java I/O.

---------------------------------------
##Method Summary##

                 static void   error(Object... objects)
                 static void   error(int status, Object... objects)
    static ArrayList<String>   file(String filename)
                 static void   newfile(String filename)
         static ServerSocket   newsocket()
         static ServerSocket   newsocket(int port)
               static Socket   newsocket(String addr)
               static Socket   newsocket(String addr, int port)   
                 static void   print(Object... objects)
                 static void   printf(String format, Object... objects)
               static String   read()
               static String   read(String filename)
               static String   read(String filename, int length)
    static ArrayList<String>   read(int lines)
               static String   read(Socket socket)
    static ArrayList<String>   read(int lines, Socket socket)
                 static void   save(ArrayList<?> data, String filename)
                 static void   write(String filename, Object... objects)
                 static void   write(String filename, int offset, Object... objects)
                 static void   write(Socket socket, Object... objects)                

---------------------------------------
##Method Detail##

**error**
    
    public static void error(Object... objects)
    
>Prints the given arguments, separated by newline, to `System.err` and exists with status 1.

>*Parameters:*

>>`objects` - The arguments to print to `System.err`.

**error**

    public static void error(int status, Object... objects)
    
>Prints the given arguments, separated by newline, to `System.err` and exists with the given status.

>*Parameters:*

>>`status` - The status with which to exit.

>>`objects` - The arguments to print to `System.err`.

**file**

    public static ArrayList<String> file(String filename)
    
>Reads in the file with the given file name, and returns it as an `ArrayList` of `String`s, separated by newline.

>*Parameters:*

>>`filename` - The name of the file from which to read.

>*Returns:*

>>The data read from the given file as an `ArrayList` of `String`s, separated by newline.

>*Throws:*

>>`FileNotFoundException` - If the file with the given name does not exist.

**newfile**

    public static void newfile(String filename)
    
>Creates a new file with the given filename, overwriting any previously existing file of the same name.

>*Parameters:*

>>`filename` - The name of the file to create.

>*Throws:*

>>`IOException` - If an I/O error occurs.

**newsocket**

    public static ServerSocket newsocket()
    
>Creates a new `ServerSocket`, listening on port 80.

>*Returns:*

>>A new `ServerSocket`, listening on port 80.

>*Throws:*

>>`UnknownHostException` - If `localhost` does not exist.

>>`IOException` - If an I/O error occurs.

**newsocket**

    public static ServerSocket newsocket(int port)
    
>Creates a new `ServerSocket`, listening on the given port.

>*Parameters:*

>>`port` - The port on which to listen.

>*Returns:*

>>A new `ServerSocket`, listening on the given port.

>*Throws:*

>>`UnknownHostException` - If `localhost` does not exist.

>>`IOException` - If an I/O error occurs.

**newsocket**

    public static Socket newsocket(String addr)
    
>Creates a new `Socket`, attached to the given address, on port 80.

>*Parameters:*

>>`addr` - The address that the `Socket` will point to.

>*Returns:*

>>A new `Socket`, attached to the given address, on port 80.

>*Throws:*

>>`UnknownHostException` - If the given host does not exist.

>>`IOException` - If an I/O error occurs.

**newsocket**

    public static Socket newsocket(String addr, int port)
    
>Creates a new `Socket`, attached to the given address, on the given port.

>*Parameters:*

>>`addr` - The address that the `Socket` will point to.

>>`port` - The port that the `Socket` will point to.

>*Returns:*

>>A new `Socket`, attached to the given address, on the given port.

>*Throws:*

>>`UnknownHostException` - If the given host does not exist.

>>`IOException` - If an I/O error occurs.

**print**

    public static void print(Object... objects)
    
>Prints the given arguments, separated by newline, to `System.out`.

>*Parameters:*

>>`objects` - The arguments to print to `System.out`.

**printf**

    public static void printf(String format, Object... objects)
    
>Prints the given arguments, formatted according to the given format, to `System.out`.

>*Parameters:*

>>`format` - The format string used to format the given arguments.

>>`objects` - The arguments to print to `System.out`.

**read**

    public static String read()
    
>Returns a `String` of input from `System.in`.

>*Returns:*

>>A `String` of input from `System.in`.

>*Throws:*

>>`IOException` - If an I/O error occurs.

**read**

    public static String read(String filename)
    
>Reads in the file with the given name, and returns it as a `String`.

>*Parameters:*

>>`filename` - The name of the file from which to read.

>*Returns:*

>>The contents of the file with the given name, as a `String`.

>*Throws:*

>>`FileNotFoundException` - If the file with the given name does not exist.

**read**

    public static String read(String filename, int length)
    
>Reads in the file with the given name, up to the given length, and returns it as a `String`.

>*Parameters:*

>>`filename` - The name of the file from which to read.

>>`length` - The length of data to read from the given file.

>*Returns:*

>>The contents of the file with the given name, up to the given length, as a `String`.

>*Throws:*

>>`FileNotFoundException` - If the file with the given name does not exist.

>>`IOException` - If an I/O error occurs.

**read**

    public static ArrayList<String> read(int lines)
    
>Reads in strings of input from `System.in`, up to the given number of lines, and returns them as an `ArrayList` of `String`s.

>*Parameters:*

>>`lines` - The number of lines to read from `System.in`.

>*Returns:*

>>An `ArrayList` of `Strings` of input from `System.in`.

>*Throws:*

>>`IOException` - If an I/O error occurs.

**read**

    public static String read(Socket socket)
    
>Reads in a `String` of input from the given socket.

>>A `String` of input from the given socket.

>*Throws:*

>>`IOException` - If an I/O error occurs.

**read**

    public static ArrayList<String> read(int lines, Socket socket)
    
>Reads in strings of input from the given socket, up to the given number of lines, and returns them as an `ArrayList` of `String`s.

>*Parameters:*

>>`lines` - The number of lines from read from the given socket.

>>`socket` - The socket from which to read.

>*Returns:*

>>An `ArrayList` of `Strings` of input from the given socket.

>*Throws:*

>>`IOException` - If an I/O error occurs.

**save**

    public static void save(ArrayList<?> data, String filename)
    
>Writes each element of the given `ArrayList`, separated by newline, to the file with the given name.

>*Parameters:*

>>`data` - The elements to write, separated by newline, to the file with the given name.

>>`filename` - The name of the file to write the given elements to.

>*Throws:*

>>`IOException` - If an I/O error occurs.

**write**

    public static void write(String filename, Object... objects)
    
>Writes the given arguments, separated by newline, to the file with the given name.

>*Parameters:*

>>`filename` - The name of the file to which to write.

>>`objects` - The arguments to write, separated by newline, to the file.

>*Throws:*

>>`IOException` - If an I/O error occurs.
    
**write**

    public static void write(String filename, int offset, Object... objects)
    
>Writes the given arguments, separated by newline, to the file with the given name, starting at the given offset.

>*Parameters:*

>>`filename` - The name of the file to which to write.

>>`offset` - The offset, in bytes, to begin writing to the file.

>>`objects` - The arguments to write, separated by newline, to the file.

>*Throws:*

>>`IOException` - If an I/O error occurs.
    
**write**

    public static void write(Socket socket, Object... objects)
    
>Writes the given arguments, separated by newline, to the given socket.

>*Parameters:*

>>`socket` - The socket to which to write.

>>`objects` - The arguments to write, separated by newline, to the socket.

>*Throws:*

>>`IOException` - If an I/O error occurs.

#License#

License Agreement for Source Code provided by Patrick Perini

This software is supplied to you by Patrick Perini in consideration of your agreement to the following terms, and your use, installation, modification or redistribution of this software constitutes acceptance of these terms. If you do not agree with these terms, please do not use, install, modify or redistribute this software.

In consideration of your agreement to abide by the following terms, and subject to these terms, Patrick Perini grants you a personal, non-exclusive license, to use, reproduce, modify and redistribute the software, with or without modifications, in source and/or binary forms; provided that if you redistribute the software in its entirety and without modifications, you must retain this notice and the following text and disclaimers in all such redistributions of the software, and that in all cases attribution of Patrick Perini as the original author of the source code shall be included in all such resulting software products or distributions. Neither the name, trademarks, service marks or logos of Patrick Perini may be used to endorse or promote products derived from the software without specific prior written permission from Patrick Perini. Except as expressly stated in this notice, no other rights or licenses, express or implied, are granted by Patrick Perini herein, including but not limited to any patent rights that may be infringed by your derivative works or by other works in which the software may be incorporated.

The software is provided by Patrick Perini on an "AS IS" basis. Patrick Perini MAKES NO WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE IMPLIED WARRANTIES OF NON-INFRINGEMENT, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE, REGARDING THE SOFTWARE OR ITS USE AND OPERATION ALONE OR IN COMBINATION WITH YOUR PRODUCTS.

IN NO EVENT SHALL Patrick Perini BE LIABLE FOR ANY SPECIAL, INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) ARISING IN ANY WAY OUT OF THE USE, REPRODUCTION, MODIFICATION AND/OR DISTRIBUTION OF THE SOFTWARE, HOWEVER CAUSED AND WHETHER UNDER THEORY OF CONTRACT, TORT (INCLUDING NEGLIGENCE), STRICT LIABILITY OR OTHERWISE, EVEN IF Patrick Perini HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.