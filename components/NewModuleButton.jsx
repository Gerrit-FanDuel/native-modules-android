import React from 'react';
import {Button} from 'react-native';
import CalendarModule from './CalendarModule';

const NewModuleButton = () => {
  const onPress = () => {
    CalendarModule.createCalendarEvent('testName', 'testLocation');
    CalendarModule.createCalendarEvent('foo', 'bar');
  };

  const {DEFAULT_EVENT_NAME} = CalendarModule.getConstants();
  console.log({DEFAULT_EVENT_NAME});

  return (
    <Button
      title="Click to invoke your native module!"
      color="#841584"
      onPress={onPress}
    />
  );
};

export default NewModuleButton;
