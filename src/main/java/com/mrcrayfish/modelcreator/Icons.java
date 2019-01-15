package com.mrcrayfish.modelcreator;

import javax.swing.*;

public class Icons
{
    public static Icon add;
    public static Icon add_rollover;
    public static Icon bin;
    public static Icon new_;
    public static Icon import_;
    public static Icon export;
    public static Icon texture;
    public static Icon clear;
    public static Icon copy;
    public static Icon clipboard;
    public static Icon transparent;
    public static Icon coin;
    public static Icon load;
    public static Icon disk;
    public static Icon exit;
    public static Icon settings;
    public static Icon cube;
    public static Icon light_off;
    public static Icon light_on;
    public static Icon arrow_up;
    public static Icon arrow_down;
    public static Icon facebook;
    public static Icon twitter;
    public static Icon reddit;
    public static Icon imgur;
    public static Icon patreon;
    public static Icon planet_minecraft;
    public static Icon minecraft_forum;
    public static Icon github;
    public static Icon model_cauldron;
    public static Icon model_chair;
    public static Icon extract;
    public static Icon mojang;
    public static Icon java;
    public static Icon undo;
    public static Icon redo;
    public static Icon optimize;
    public static Icon rotate;
    public static Icon rotate_clockwise;
    public static Icon rotate_counter_clockwise;
    public static Icon refresh;
    public static Icon gallery;
    public static Icon bin2;
    public static Icon edit_image;

    public static void init(Class<?> clazz)
    {
        ClassLoader loader = clazz.getClassLoader();

        cube = new ImageIcon(loader.getResource("icons/cube.png"));
        bin = new ImageIcon(loader.getResource("icons/bin.png"));
        add = new ImageIcon(loader.getResource("icons/add.png"));
        add_rollover = new ImageIcon(loader.getResource("icons/add_rollover.png"));
        new_ = new ImageIcon(loader.getResource("icons/new.png"));
        import_ = new ImageIcon(loader.getResource("icons/import.png"));
        export = new ImageIcon(loader.getResource("icons/export.png"));
        texture = new ImageIcon(loader.getResource("icons/texture.png"));
        clear = new ImageIcon(loader.getResource("icons/clear.png"));
        copy = new ImageIcon(loader.getResource("icons/copy.png"));
        clipboard = new ImageIcon(loader.getResource("icons/clipboard.png"));
        transparent = new ImageIcon(loader.getResource("icons/transparent.png"));
        coin = new ImageIcon(loader.getResource("icons/coin.png"));
        load = new ImageIcon(loader.getResource("icons/load.png"));
        disk = new ImageIcon(loader.getResource("icons/disk.png"));
        exit = new ImageIcon(loader.getResource("icons/exit.png"));
        settings = new ImageIcon(loader.getResource("icons/settings.png"));
        extract = new ImageIcon(loader.getResource("icons/extract.png"));
        light_off = new ImageIcon(loader.getResource("icons/box_off.png"));
        light_on = new ImageIcon(loader.getResource("icons/box_on.png"));
        arrow_up = new ImageIcon(loader.getResource("icons/arrow_up.png"));
        arrow_down = new ImageIcon(loader.getResource("icons/arrow_down.png"));
        facebook = new ImageIcon(loader.getResource("icons/facebook.png"));
        twitter = new ImageIcon(loader.getResource("icons/twitter.png"));
        reddit = new ImageIcon(loader.getResource("icons/reddit.png"));
        imgur = new ImageIcon(loader.getResource("icons/imgur.png"));
        patreon = new ImageIcon(loader.getResource("icons/patreon.png"));
        planet_minecraft = new ImageIcon(loader.getResource("icons/planet_minecraft.png"));
        minecraft_forum = new ImageIcon(loader.getResource("icons/minecraft_forum.png"));
        github = new ImageIcon(loader.getResource("icons/github.png"));
        model_cauldron = new ImageIcon(loader.getResource("icons/model_cauldron.png"));
        model_chair = new ImageIcon(loader.getResource("icons/model_chair.png"));
        mojang = new ImageIcon(loader.getResource("icons/mojang.png"));
        java = new ImageIcon(loader.getResource("icons/java.png"));
        undo = new ImageIcon(loader.getResource("icons/undo.png"));
        redo = new ImageIcon(loader.getResource("icons/redo.png"));
        optimize = new ImageIcon(loader.getResource("icons/optimize.png"));
        rotate = new ImageIcon(loader.getResource("icons/rotate.png"));
        rotate_clockwise = new ImageIcon(loader.getResource("icons/rotate_clockwise.png"));
        rotate_counter_clockwise = new ImageIcon(loader.getResource("icons/rotate_anticlockwise.png"));
        refresh = new ImageIcon(loader.getResource("icons/refresh.png"));
        gallery = new ImageIcon(loader.getResource("icons/gallery.png"));
        bin2 = new ImageIcon(loader.getResource("icons/bin2.png"));
        edit_image = new ImageIcon(loader.getResource("icons/edit_image.png"));
    }
}
