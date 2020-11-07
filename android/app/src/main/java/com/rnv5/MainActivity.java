package com.rnv5;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {
  private TextView textView;

  private static String ip=" 192.168.8.185";
  private static String PORT="";
  private static String Class="net.sourceforge.jtds.jdbc.Driver";
  private static String database="testDatabase";
  private static String username="test";
  private static String password="test";
  private static String url="jdbc:jtds:sqlserver://"+ip+"1"+port+"/"+database;

  private Connection connection=null;


  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "rnv5";
  }
}
