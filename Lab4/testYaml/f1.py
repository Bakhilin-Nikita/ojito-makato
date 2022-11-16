# 1
import xml.etree.ElementTree as ET
import yaml
from yaml import SafeLoader

with open('Wednesday.yaml') as fp:
    result = yaml.load(fp, Loader=SafeLoader)

# create a file structure
schedule = ET.Element('lessons_info')
for i in range(3):
    sb = ET.SubElement(schedule, 'Subject')
    name = ET.SubElement(sb, 'name')
    name.set('name', 'name')
    name.text = result['lessons_info'][i]['subject']['name']
    time = ET.SubElement(sb, 'time')
    time.set('time', 'time')
    time.text = result['lessons_info'][i]['subject']['time']
    teacher = ET.SubElement(sb, 'teacher')
    teacher.set('teacher', 'teacher')
    teacher.text = result['lessons_info'][i]['subject']['teacher']
    format = ET.SubElement(sb, 'format')
    format.set('format', 'format')
    format.text = result['lessons_info'][i]['subject']['format']
    week = ET.SubElement(sb, 'type_of_week')
    week.set('type_of_week', 'type_of_week')
    week.text = result['lessons_info'][i]['subject']['type_of_week']

# create a new XML file
mydata = ET.tostring(schedule)
file = open('Wednesday.xml', 'w')
mydata = mydata.decode('utf-8')
file.write(mydata)


