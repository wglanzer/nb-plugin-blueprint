package com.github.wglanzer.nbm.examples;

import org.openide.awt.*;
import org.openide.util.NbBundle;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Simple Dummy Action, which will be shown in File-Toolbar
 *
 * @author w.glanzer, 12.10.2018
 */
@NbBundle.Messages("ACTION_MyAction=Click me!")
@ActionID(category = "System", id = "com.github.wglanzer.nbm.examples.MyAction")
@ActionRegistration(displayName = "#ACTION_MyAction")
@ActionReference(path = "Toolbars/File", position = 0)
public class MyAction extends AbstractAction
{

  public void actionPerformed(ActionEvent e)
  {
    NotificationDisplayer.getDefault().notify("CLICKED!", null, "You clicked me, thank you!", null);
  }

}
