# 2
import yaml
from dicttoxml import dicttoxml

with open('Wednesday.yaml') as yaml_data:
    yaml_parsed = yaml.load(yaml_data, Loader=yaml.FullLoader)

xmlF = dicttoxml(yaml_parsed, custom_root='test', attr_type=False)

print(xmlF.decode('utf-8'))

f = open('Wednesday2.xml', 'a')
f.write(xmlF.decode())
f.close()

