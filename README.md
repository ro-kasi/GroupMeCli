# GroupMeCli
This is a command Line Client for GroupMe, I threw this togther in a couple of hours for fun. It uses a rather old [websocket  library](https://github.com/TooTallNate/Java-WebSocket)/[Unirest](https://github.com/Mashape/unirest-java) for HTTP stuff, and [lanterna](https://github.com/mabe02/lanterna) for greating the UI. Fair warning this was a 3 hours effor, there's lots of weird quirks and bugs.

## Install Instructions
1. Install Java 8 from [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html) or use [OpenJDK]( (JRE is enogh).
2. Get your GroupMe access token from [dev.groupme.com](dev.groupme.com)
    * Log in normally
    * Click the "Access Token" button on the top right
    * Copy the long sequence of numbers in bold **Don't share this with anyone**
3. Grab the lastest copy of the app from [here](https://github.com/ro-kasi/GroupMeCli/raw/master/builds/GmCli.jar)
    * Copy this to your desktop
4. Open a terminal window, type the following commands in order:
    * cd ~/Desktop 
    * java -cp GmCli.jar com.rokasi.gmcli.main.GmCli YOUR_TOKEN_FROM_STEP_TWO
