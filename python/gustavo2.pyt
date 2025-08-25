CigDias = int(input('Cigarros Fumados por dia: '))
CigAnos = int(input('Anos fumando Cigarro: '))
DiasdoAno = 365

CigFum = CigAnos *  DiasdoAno * CigDias

Hrs = DiasdoAno / 24

Min = Hrs / 60

ValMin = Min * CigFum / 10

ValHrs = ValMin / 60

ValFinal = ValHrs / 24

print (ValFinal)