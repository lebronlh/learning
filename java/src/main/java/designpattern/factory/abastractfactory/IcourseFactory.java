package designpattern.factory.abastractfactory;

import designpattern.factory.ICourse;


public interface IcourseFactory {
    INote createNote();
    IVideo createVideo();
}
